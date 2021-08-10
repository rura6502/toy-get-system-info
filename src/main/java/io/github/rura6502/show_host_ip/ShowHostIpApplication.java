package io.github.rura6502.show_host_ip;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.net.NetworkInterface;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;

@SpringBootApplication
public class ShowHostIpApplication {

  public static void main(String[] args) {
    SpringApplication.run(ShowHostIpApplication.class, args);
  }

}

@RestController
class TestController {

  @GetMapping("/")
  public String index(HttpServletRequest request) throws Exception {
    StringBuilder builder = new StringBuilder();

    builder.append(request.getRemoteAddr() + "<br>");

    OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
    builder.append(
      String.format("system : %s, %s, %s, %d core <br>"
                                , osBean.getArch()
                                , osBean.getName()
                                , osBean.getVersion()
                                , osBean.getAvailableProcessors()));

    
    SystemInfo si = new SystemInfo();
    HardwareAbstractionLayer layer = si.getHardware();
    builder.append(layer.getProcessor().getProcessorIdentifier() + "<br>");
    builder.append("physical CPU package(s) : " + layer.getProcessor().getPhysicalPackageCount() + "<br>");
    builder.append("physical CPU core(s) : " + layer.getProcessor().getPhysicalProcessorCount() + "<br>");
    builder.append("logical CPU(s) : " + layer.getProcessor().getLogicalProcessorCount() + "<br>");

    builder.append("mem total(Gib) : " + layer.getMemory().getTotal()/1024f/1024f/1024f + "<br>");
    builder.append("mem Available(Gib) : " + layer.getMemory().getAvailable()/1024f/1024f/1024f + "<br>");
    builder.append("mem used(Gib) : " + (layer.getMemory().getTotal() - layer.getMemory().getAvailable())/1024f/1024f/1024f + "<br>");
    builder.append(layer.getComputerSystem() + "<br>");


    Enumeration<NetworkInterface> ifs = NetworkInterface.getNetworkInterfaces();
    while (ifs.hasMoreElements()) {
      NetworkInterface ift = ifs.nextElement();
      if (ift.isUp()) {
        builder.append(String.format("%s, %s, %s <br>", ift.getName(), ift.getDisplayName(), ift.getInterfaceAddresses()));
      }
    }
    return builder.toString();
  }
}