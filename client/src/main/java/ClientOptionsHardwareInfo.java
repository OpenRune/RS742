import deob.ObfuscatedName;

@ObfuscatedName("tr")
public class ClientOptionsHardwareInfo {

    @ObfuscatedName("tr.u")
    public int maxHeapMemoryMb;

    @ObfuscatedName("tr.j")
    public int availableProcessors;

    @ObfuscatedName("tr.a")
    public boolean isArmArchitecture;

    public ClientOptionsHardwareInfo(int maxHeapMemoryMb, int availableProcessors, boolean isArmArchitecture) {
        this.maxHeapMemoryMb = maxHeapMemoryMb;
        this.availableProcessors = availableProcessors;
        this.isArmArchitecture = isArmArchitecture;
    }

    @ObfuscatedName("tr.u(I)I")
    public int method11399() {
        return this.maxHeapMemoryMb;
    }

    @ObfuscatedName("tr.j(I)I")
    public int method11398() {
        return this.availableProcessors;
    }

    @ObfuscatedName("tr.a(I)Z")
    public boolean method11400() {
        return this.isArmArchitecture;
    }
}
