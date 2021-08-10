# toy-get-system-info
get server resource on web server

* gradle
* spring boot

## Run & Access

```
./gradew bootRun
localhost:8080
```

you can access 'http://localhost:8080' in your browser and then can see the system resource.

```
0:0:0:0:0:0:0:1
system : amd64, Windows 10, 10.0, 8 core
Intel64 Family 6 Model 142 Stepping 12
physical CPU package(s) : 1
physical CPU core(s) : 4
logical CPU(s) : 8
mem total(Gib) : 15.785118
mem Available(Gib) : 2.206688
mem used(Gib) : 13.57843
manufacturer=LENOVO, model=20NYS27600, serial number=PC17GBBE, uuid=6E8CFFCC-2708-11B2-A85C-87A3D6B963F3
lo, Software Loopback Interface 1, [/127.0.0.1/8 [/127.255.255.255], /0:0:0:0:0:0:0:1/128 [null]]
eth4, Hyper-V Virtual Ethernet Adapter, [/172.28.192.1/20 [/172.28.207.255], /fe80:0:0:0:403e:6df:919b:441a%eth4/64 [null]]
eth8, Realtek USB GbE Family Controller #2, [/192.168.11.90/24 [/192.168.11.255], /fe80:0:0:0:90a1:7ae0:7b29:381b%eth8/64 [null]]
eth15, Hyper-V Virtual Ethernet Adapter #2, [/172.28.128.1/20 [/172.28.143.255], /fe80:0:0:0:b120:bef:5d51:179c%eth15/64 [null]]
wlan2, Intel(R) Wireless-AC 9560 160MHz, [/192.168.11.74/24 [/192.168.11.255], /fe80:0:0:0:d4:597a:a171:8cf2%wlan2/64 [null]]
eth17, VirtualBox Host-Only Ethernet Adapter, [/192.168.56.1/24 [/192.168.56.255], /fe80:0:0:0:bcba:17c3:40cc:70c1%eth17/64 [null]]
eth29, Hyper-V Virtual Ethernet Adapter #3, [/172.21.176.1/20 [/172.21.191.255], /fe80:0:0:0:d5dd:71dd:b27d:8958%eth29/64 [null]]
eth34, Hyper-V Virtual Ethernet Adapter #4, [/172.22.64.1/20 [/172.22.79.255], /fe80:0:0:0:e96a:515c:21e6:7571%eth34/64 [null]]
eth39, Hyper-V Virtual Ethernet Adapter #5, [/172.31.96.1/20 [/172.31.111.255], /fe80:0:0:0:f496:7560:67f9:bed7%eth39/64 [null]]
eth44, Hyper-V Virtual Ethernet Adapter #6, [/172.22.128.1/20 [/172.22.143.255], /fe80:0:0:0:59e9:634f:ea1f:894b%eth44/64 [null]]
eth51, Hyper-V Virtual Ethernet Adapter #7, [/172.20.0.1/20 [/172.20.15.255], /fe80:0:0:0:509f:f06d:447c:501a%eth51/64 [null]]
```

