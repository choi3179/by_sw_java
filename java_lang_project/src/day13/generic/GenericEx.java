
package day13.generic;

class GenericEx<T> {    // 타입이 아직 결정나지 않은 제너릭 클래스 임을 선언
    T[] x;    // 아직 타입이 결정나지 않은 멤버변수

    public void setX(T[] x){
        this.x=x;
    }

    public T[] getX(){
        return x;
    }

    public void print() {
        for(T item: x){
            System.out.println(item);
        }
    }

}