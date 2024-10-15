package com.tenco.blog_v2.common.errors;

public class Exeption500 extends RuntimeException {
    // throw new Exception400("야 너 잘못 던졌어"); <-- 사용하는 시점에 호출 모습
    public Exeption500(String msg) {
        super(msg);
    }
}
