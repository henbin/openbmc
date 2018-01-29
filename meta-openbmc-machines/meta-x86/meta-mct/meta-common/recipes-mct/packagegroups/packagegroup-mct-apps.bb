SUMMARY = "OpenBMC for MCT - Applications"
PR = "r1"

inherit packagegroup
inherit obmc-phosphor-license

PROVIDES = "${PACKAGES}"
PACKAGES = " \
        ${PN}-chassis \
        ${PN}-fans \
        ${PN}-flash \
        ${PN}-system \
        "

PROVIDES += "virtual/obmc-chassis-mgmt"
PROVIDES += "virtual/obmc-fan-mgmt"
PROVIDES += "virtual/obmc-flash-mgmt"
PROVIDES += "virtual/obmc-system-mgmt"

RPROVIDES_${PN}-chassis += "virtual-obmc-chassis-mgmt"
RPROVIDES_${PN}-fans += "virtual-obmc-fan-mgmt"
RPROVIDES_${PN}-flash += "virtual-obmc-flash-mgmt"
RPROVIDES_${PN}-system += "virtual-obmc-system-mgmt"

SUMMARY_${PN}-chassis = "MCT Chassis"
RDEPENDS_${PN}-chassis = " \
        obmc-button-power \
        obmc-button-reset \
        obmc-control-chassis \
        obmc-op-control-power \
        obmc-host-failure-reboots \
        "

SUMMARY_${PN}-fans = "MCT Fans"
RDEPENDS_${PN}-fans = " \
        obmc-control-fan \
        "

SUMMARY_${PN}-flash = "MCT Flash"
RDEPENDS_${PN}-flash = " \
        obmc-flash-bmc \
        obmc-mgr-download \
        obmc-control-bmc \
        "

SUMMARY_${PN}-system = "MCT System"
RDEPENDS_${PN}-system = " \
        obmc-mgr-system \
        "
