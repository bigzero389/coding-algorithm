package data.structure;

//  A. ASCII 문자열인지 유니코드인지 확인, 여기서는 ASCII 로 가정함. 총 문자의 개수가 256개 라고 가정했다.
//  시간복잡도는 O(n) 이다. n은 문자열 길이, 공간 복잡도는 O(1) 이다. 하지만 256개보다 많은 문자를 순회하지 않기 때문에
//  시간복잡도가 O(1) 이라고도 할 수 있다.
public class Test_01 {
  public void exec_01_01() {
    String str = "aab";
    boolean result = isUniqueChars(str);
    System.out.println(result);
  }

  public boolean isUniqueChars(String str) {
    final int maxCharLength = 256;
    // 최대 ASCII 문자열 집합의 크기보다 입력된 문자열 길이가 크면 무조건 unique 가 아님.
    if (str.length() >= maxCharLength) return false;

//  각 문자열별로 배열을 이미 존재했는지 여부를 저장하는 배열 생성
    boolean[] char_set = new boolean[maxCharLength];
    for (int i = 0, j = str.length(); i < j; i++) {
      int val = str.charAt(i);
      System.out.print(i + ":" + Character.toString(val) + ":"+ + val + "\n");
      if (char_set[val]) {
        return false;
      }
      char_set[val] = true;
    }
    return true;
  }
}