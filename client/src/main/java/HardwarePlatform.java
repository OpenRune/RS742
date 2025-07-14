import deob.ObfuscatedName;
import jaclib.hardware_info.HardwareInfo;

import java.util.HashMap;

@ObfuscatedName("aeb")
public class HardwarePlatform extends Node {

    @ObfuscatedName("aeb.f")
    public int osType;

    @ObfuscatedName("aeb.d")
    public boolean is64Bit;

    @ObfuscatedName("aeb.g")
    public int osVersionCode;

    @ObfuscatedName("aeb.ar")
    public int javaVendorCode;

    @ObfuscatedName("aeb.an")
    public int javaVersionMajor;

    @ObfuscatedName("aeb.ap")
    public int javaVersionMinor;

    @ObfuscatedName("aeb.ag")
    public int javaVersionPatch;

    @ObfuscatedName("aeb.as")
    public boolean unknownFlag;

    @ObfuscatedName("aeb.ai")
    public int maxHeapMemoryMb;

    @ObfuscatedName("aeb.al")
    public int availableProcessors;

    @ObfuscatedName("aeb.ax")
    public int cpuFeatures;

    @ObfuscatedName("aeb.aj")
    public int cpuFamily;

    @ObfuscatedName("aeb.ah")
    public int cpuStepping;

    @ObfuscatedName("aeb.ac")
    public int[] additionalCpuInfo = new int[3];

    @ObfuscatedName("aeb.aq")
    public int cpuFrequency;

    @ObfuscatedName("aeb.aw")
    public int cpuModel;
    @ObfuscatedName("aeb.aa")
    public String gpuDescription;

    @ObfuscatedName("aeb.am")
    public String unknownString1;

    @ObfuscatedName("aeb.ad")
    public String directXVersion;

    @ObfuscatedName("aeb.az")
    public String unknownString2;

    @ObfuscatedName("aeb.ak")
    public int gpuDriverYear;

    @ObfuscatedName("aeb.av")
    public int gpuDriverMonth;

    @ObfuscatedName("aeb.au")
    public String rawCpuInfoString1;

    @ObfuscatedName("aeb.ae")
    public String rawCpuInfoString2;

    public HardwarePlatform(boolean collect) {
        if (collect) {
            if (Statics.osName.startsWith("win")) {
                this.osType = 1;
            } else if (Statics.osName.startsWith("mac")) {
                this.osType = 2;
            } else if (Statics.osName.startsWith("linux")) {
                this.osType = 3;
            } else {
                this.osType = 4;
            }
            this.is64Bit = Statics.osArch.startsWith("amd64") || Statics.osArch.startsWith("x86_64");
            if (this.osType == 1) {
                if (Statics.osVersion.contains("4.0")) this.osVersionCode = 1;
                else if (Statics.osVersion.contains("4.1")) this.osVersionCode = 2;
                else if (Statics.osVersion.contains("4.9")) this.osVersionCode = 3;
                else if (Statics.osVersion.contains("5.0")) this.osVersionCode = 4;
                else if (Statics.osVersion.contains("5.1")) this.osVersionCode = 5;
                else if (Statics.osVersion.contains("5.2")) this.osVersionCode = 8;
                else if (Statics.osVersion.contains("6.0")) this.osVersionCode = 6;
                else if (Statics.osVersion.contains("6.1")) this.osVersionCode = 7;
                else if (Statics.osVersion.contains("6.2")) this.osVersionCode = 9;
            } else if (this.osType == 2) {
                if (Statics.osVersion.contains("10.4")) this.osVersionCode = 20;
                else if (Statics.osVersion.contains("10.5")) this.osVersionCode = 21;
                else if (Statics.osVersion.contains("10.6")) this.osVersionCode = 22;
                else if (Statics.osVersion.contains("10.7")) this.osVersionCode = 23;
            }
            String vendor = Statics.javaVendorName.toLowerCase();
            if (vendor.contains("sun")) this.javaVendorCode = 1;
            else if (vendor.contains("microsoft")) this.javaVendorCode = 2;
            else if (!vendor.contains("apple")) this.javaVendorCode = 4;
            else this.javaVendorCode = 3;
            int idx = 2, major = 0;
            try {
                while (idx < Statics.javaVersion.length()) {
                    char c = Statics.javaVersion.charAt(idx);
                    if (c < '0' || c > '9') break;
                    major = major * 10 + (c - '0');
                    idx++;
                }
            } catch (Exception ignored) {}
            this.javaVersionMajor = major;
            int minorIdx = Statics.javaVersion.indexOf('.', 2) + 1, minor = 0;
            try {
                while (minorIdx < Statics.javaVersion.length()) {
                    char c = Statics.javaVersion.charAt(minorIdx);
                    if (c < '0' || c > '9') break;
                    minor = minor * 10 + (c - '0');
                    minorIdx++;
                }
            } catch (Exception ignored) {}
            this.javaVersionMinor = minor;
            int patchIdx = Statics.javaVersion.indexOf('_', 4) + 1, patch = 0;
            try {
                while (patchIdx < Statics.javaVersion.length()) {
                    char c = Statics.javaVersion.charAt(patchIdx);
                    if (c < '0' || c > '9') break;
                    patch = patch * 10 + (c - '0');
                    patchIdx++;
                }
            } catch (Exception ignored) {}
            this.javaVersionPatch = patch;
            this.unknownFlag = false;
            this.maxHeapMemoryMb = GameShell.maxHeapMemoryMb;
            this.availableProcessors = (this.javaVersionMajor > 3) ? GameShell.availableProcessors : 0;
            try {
                int[] cpuInfo = HardwareInfo.getCPUInfo();
                if (cpuInfo != null && cpuInfo.length == 3) {
                    this.cpuFamily = cpuInfo[0];
                    this.cpuModel = cpuInfo[1];
                    this.cpuFeatures = cpuInfo[2];
                }
                int[] rawCpu = HardwareInfo.getRawCPUInfo();
                if (rawCpu != null && rawCpu.length % 5 == 0) {
                    HashMap<Integer, RawCpuInfo> cpuMap = new HashMap();
                    for (int i = 0; i < rawCpu.length / 5; i++) {
                        RawCpuInfo info = new RawCpuInfo(
                            rawCpu[i * 5], rawCpu[i * 5 + 1], rawCpu[i * 5 + 2], rawCpu[i * 5 + 3], rawCpu[i * 5 + 4]
                        );
                        cpuMap.put(info.field6824, info);
                    }
                    RawCpuInfo info0 = cpuMap.get(0);
                    if (info0 != null) {
                        Packet p = new Packet(13);
                        p.ip4(info0.field6822);
                        p.ip4(info0.field6820);
                        p.ip4(info0.field6823);
                        p.pos = 0;
                        this.rawCpuInfoString1 = p.gjstr();
                    }
                    RawCpuInfo info1 = cpuMap.get(1);
                    if (info1 != null) {
                        this.cpuFrequency = info1.field6821;
                        int v = info1.field6822;
                        this.cpuStepping = (v >> 16) & 0xFF;
                        this.additionalCpuInfo[0] = info1.field6823;
                        this.additionalCpuInfo[1] = info1.field6820;
                    }
                    RawCpuInfo infoNeg = cpuMap.get(-2147483647);
                    if (infoNeg != null) {
                        this.additionalCpuInfo[2] = infoNeg.field6820;
                    }
                    Packet p2 = new Packet(49);
                    for (int i = -2147483646; i <= -2147483644; i++) {
                        RawCpuInfo inf = cpuMap.get(i);
                        if (inf != null) {
                            p2.ip4(inf.field6821);
                            p2.ip4(inf.field6822);
                            p2.ip4(inf.field6823);
                            p2.ip4(inf.field6820);
                        }
                    }
                    p2.pos = 0;
                    this.rawCpuInfoString2 = p2.gjstr();
                }
                String[][] dxDevices = HardwareInfo.getDXDiagDisplayDevicesProps();
                if (dxDevices != null && dxDevices.length > 0 && dxDevices[0] != null) {
                    for (int i = 0; i < dxDevices[0].length; i += 2) {
                        if (dxDevices[0][i].equalsIgnoreCase("szDescription")) {
                            this.gpuDescription = dxDevices[0][i + 1];
                        } else if (dxDevices[0][i].equalsIgnoreCase("szDriverDateEnglish")) {
                            String date = dxDevices[0][i + 1];
                            try {
                                int slash1 = date.indexOf("/");
                                int slash2 = date.indexOf("/", slash1 + 1);
                                this.gpuDriverMonth = Integer.parseInt(date.substring(0, slash1));
                                this.gpuDriverYear = Integer.parseInt(date.substring(slash2 + 1, date.indexOf(" ", slash2)));
                            } catch (Exception ignored) {}
                        }
                    }
                }
                String[] dxSys = HardwareInfo.getDXDiagSystemProps();
                if (dxSys != null) {
                    String majorLocal = "", minorLocal = "", letter = "";
                    for (int i = 0; i < dxSys.length; i += 2) {
                        if (dxSys[i].equalsIgnoreCase("dwDirectXVersionMajor")) majorLocal = dxSys[i + 1];
                        else if (dxSys[i].equalsIgnoreCase("dwDirectXVersionMinor")) minorLocal = dxSys[i + 1];
                        else if (dxSys[i].equalsIgnoreCase("dwDirectXVersionLetter")) letter = dxSys[i + 1];
                    }
                    this.directXVersion = majorLocal + "." + minorLocal + letter;
                }
            } catch (Throwable ignored) {
                this.cpuFeatures = 0;
            }
        }
        if (this.gpuDescription == null) this.gpuDescription = "";
        if (this.unknownString1 == null) this.unknownString1 = "";
        if (this.directXVersion == null) this.directXVersion = "";
        if (this.unknownString2 == null) this.unknownString2 = "";
        if (this.rawCpuInfoString1 == null) this.rawCpuInfoString1 = "";
        if (this.rawCpuInfoString2 == null) this.rawCpuInfoString2 = "";
        this.truncateStrings();
    }

    @ObfuscatedName("aeb.u(I)V")
    public void truncateStrings() {
        if (this.gpuDescription.length() > 40) this.gpuDescription = this.gpuDescription.substring(0, 40);
        if (this.unknownString1.length() > 40) this.unknownString1 = this.unknownString1.substring(0, 40);
        if (this.directXVersion.length() > 10) this.directXVersion = this.directXVersion.substring(0, 10);
        if (this.unknownString2.length() > 10) this.unknownString2 = this.unknownString2.substring(0, 10);
    }

    @ObfuscatedName("aeb.j(Laet;I)V")
    public void createHardwareBlock(Packet buf) {
        buf.p1(6);
        buf.p1(this.osType);
        buf.p1(this.is64Bit ? 1 : 0);
        buf.p1(this.osVersionCode);
        buf.p1(this.javaVendorCode);
        buf.p1(this.javaVersionMajor);
        buf.p1(this.javaVersionMinor);
        buf.p1(this.javaVersionPatch);
        buf.p1(this.unknownFlag ? 1 : 0);
        buf.p2(this.maxHeapMemoryMb);
        buf.p1(this.availableProcessors);
        buf.p3(this.cpuFeatures);
        buf.p2(this.cpuModel);
        buf.pjstr2(this.gpuDescription);
        buf.pjstr2(this.unknownString1);
        buf.pjstr2(this.directXVersion);
        buf.pjstr2(this.unknownString2);
        buf.p1(this.gpuDriverMonth);
        buf.p2(this.gpuDriverYear);
        buf.pjstr2(this.rawCpuInfoString1);
        buf.pjstr2(this.rawCpuInfoString2);
        buf.p1(this.cpuFamily);
        buf.p1(this.cpuStepping);
        for (int i = 0; i < this.additionalCpuInfo.length; i++) {
            buf.p4(this.additionalCpuInfo[i]);
        }
        buf.p4(this.cpuFrequency);
    }

    @ObfuscatedName("aeb.a(I)I")
    public int getBlockLength() {
        byte base = 38;
        int len = base + Packet.pjstr2len(this.gpuDescription);
        len += Packet.pjstr2len(this.unknownString1);
        len += Packet.pjstr2len(this.directXVersion);
        len += Packet.pjstr2len(this.unknownString2);
        len += Packet.pjstr2len(this.rawCpuInfoString1);
        len += Packet.pjstr2len(this.rawCpuInfoString2);
        return len;
    }
}
