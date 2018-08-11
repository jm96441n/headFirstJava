// test class for code magnet exercise
// Expected output:
// bang bang ba-bang
// ding ding da-ding

class DrumKitTestDrive {
  public static void main(String[] args) {
    DrumKit d = new DrumKit();

    d.playSnare();
    d.snare = false;

    d.playTopHat();

    if (d.snare == true) {
      d.playSnare();
    }
  }
}
