package CirculoV2;

import static java.lang.Math.*;

class Ponto {
  private int x,y;
  Ponto() {
    //x = 3; y = 4;
    this(3,4);
  }
  Ponto(int x, int y) {
    this.x = x;
    this.y = y;
  }
  Ponto(int z) {
    //x = z; y = z;
    this(z,z);
  }
  void deslocarX(int v) {
    x = x + v;
  }
  void deslocarY(int v) {
    y = y + v;
  }
  double norma() {
    //return sqrt(x*x + y*y);
    //return sqrt(pow(x,2) + pow(y,2));
    return norma(new Ponto(0,0));
  }
  double norma(Ponto q) {
    int dx = this.x - q.x,
        dy = this.y - q.y;
    return sqrt(dx*dx + dy*dy);
  }
  int normaX(Ponto q) {
    int dx = this.x - q.x;
    return abs(dx);
  }
  int normaY(Ponto q) {
    int dy = this.y - q.y;
    return abs(dy);
  }

  void mostrar() {
    System.out.println("("+ x +","+ y +")");
  }
}
