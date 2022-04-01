package ch.heigvd.dil;

public class Version {
  private final int major;
  private final int minor;
  private final int patch;

  public Version(int major, int minor, int patch) {
    this.major = major;
    this.minor = minor;
    this.patch = patch;
  }

  public int getMajor() {
    return major;
  }

  public int getMinor() {
    return minor;
  }

  public int getPatch() {
    return patch;
  }

  @Override
  public String toString() {
    return major + "." + minor + "." + patch;
  }

  public static final Version CURRENT = new Version(0, 1, 0);
}
