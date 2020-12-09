package io.xxnjdg.test;

public class AA {
}

interface I1 {
    void operation1();
}

interface I2 {
    void operation2();
    void operation3();
}
interface I3 {
    void operation4();
    void operation5();
}

class A1 {
    public void depend1(I1 i){
        i.operation1();
    }
    public void depend2(I2 i){
        i.operation2();
    }
    public void depend3(I2 i){
        i.operation3();
    }

}

class C1 {
    public void depend1(I1 i){
        i.operation1();
    }
    public void depend2(I3 i){
        i.operation4();
    }
    public void depend3(I3 i){
        i.operation5();
    }

}

class B1 implements I1,I2 {
    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }
}

class D1 implements I1,I3 {
    @Override
    public void operation1() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {

    }
}