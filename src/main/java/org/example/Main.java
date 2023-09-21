package org.example;

// 문제 : 클래스 5개 이상 만들고 각각을 객체화 하여 메서드를 호출해주세요.

class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        a.AA();
        b.BB();
        c.CC();
        d.DD();
        e.EE();
    }
}

class A {
    void AA() {
        System.out.println("A입니다.");
    }
}
class B {
    void BB() {
        System.out.println("B입니다.");
    }
}

class C {
    void CC() {
        System.out.println("C입니다.");
    }
}

class D {
    void DD() {
        System.out.println("D입니다.");
    }
}

class E {
    void EE () {
        System.out.println("E입니다.");
    }
}