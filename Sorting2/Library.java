public class Library {
  // Sử dụng thư viện để thực hiện sắp xếp. Nên sử dụng Interface Comparator
  // Interface Comparator(override phương thức Compare). so sánh 2 object

  // @Override
  // public int compare(Student o1, Student o2) {
  // return o1.getAge() > o2.getAge() ? 1 : -1;
  // }

  // So sánh tuổi của 2 đối tượng. Sắp xếp theo kiểu tăng dần Nếu o1 > o2 thì
  // return 1. o1 đứng sau
  // Nếu o1 < o2 thì return -1. o1 đứng trước
  //
  // -----------------------------------------------------
  // Interface Comparator(override phương thức Compare).
  // implements vào class của đối tượng so sánh
  //
  // @Override
  // public int compareTo(Student o) {
  // if (this.getCode() > o.getCode()) {
  // return 1;
  // }
  // if (this.getCode() < o.getCode()) {
  // return -1;
  // }
  // return 0;
  // }
}
