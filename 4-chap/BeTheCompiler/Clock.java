// Will not compile due to the `getTime` method specifying it does not return anything
// but in fact it does return a String. To compile, change line 10 to read:
// String getTime() {

class Clock {
  String time;

  void setTime(String t) {
    time = t;
  }

  void getTime() {
    return time;
  }
}
