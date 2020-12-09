package io.xxnjdg.test;

public class AA1 {
}

interface I0 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class A0 {
    public void depend1(I0 i){
        i.operation1();
    }
    public void depend2(I0 i){
        i.operation2();
    }
    public void depend3(I0 i){
        i.operation3();
    }

}

class C0 {
    public void depend1(I0 i){
        i.operation1();
    }
    public void depend2(I0 i){
        i.operation4();
    }
    public void depend3(I0 i){
        i.operation5();
    }

}

class B0 implements I0 {
    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }

    @Override
    public void operation4() {
        
    }

    @Override
    public void operation5() {

    }
}

class D0 implements I0 {
    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {

    }
}