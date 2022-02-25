package Node_class_practice;

public class Node {

    private int x;
    private int y;
    // in order to not able to access from outside and try to change x and y , set it to private instead of public.


    public int getX() {// to get x from outside.
        return x;
    }// this is to get private int x,현재 내가 가지고 있는 프라이빗 X 의 값을 퍼블릭으로 엑세스 하는것 ,
    public void setX(int x) {
        this.x = x;  // 자신이 가지고 있는 고유의 x 의 속성을 지금 들어온 파라미터  x로 바꾸어 주겠다 ,
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    //conductor
    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Node getCenter(Node other){
        return new Node((this.x + other.getX())/2 , (this.y + other.getY())/2);
    }

 }



