from scapy.all import *

ip = get_if_addr(conf.iface)
print(ip)

ipp = ip.split('.')
ips = ipp[-1]
ipb = '.'.join(ipp[0:-1])
print(ips)
ptint(ipb)

p = 11001
for i in range(1, 256):
    ipc = ipb + '.' + ipc
    print(ipc)


ans, uans = sr(IP(dst='192.168.225.1', proto=(0,255))/"SCAPY",retry=2)
