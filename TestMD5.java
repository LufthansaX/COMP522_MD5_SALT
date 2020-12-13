package com.ding.util.md5;

public class TestMD5 {

    // 测试MD5Util依赖项目
    public static void main(String args[]) {
        // plain text
        String plaintext = "Fuck you computer science";
        System.out.println("Original String Information Text：" + plaintext);
        System.out.println("First result processed via MD5：" + MD5Util.MD5(plaintext));

        // get value after salt
        String ciphertext = MD5Util.generate(plaintext);
        System.out.println("Result With salt ：" + ciphertext);
        System.out.println("Is that same?:" + MD5Util.verify(plaintext, ciphertext));
        /**
         * check twice
         */
//        String[] tempSalt = { "c4d980d6905a646d27c0c437b1f046d4207aa2396df6af86", "66db82d9da2e35c95416471a147d12e46925d38e1185c043", "61a718e4c15d914504a41d95230087a51816632183732b5a" };
//
//        for (String temp : tempSalt) {
//            System.out.println("Is this same:" + MD5Util.verify(plaintext, temp));
//        }
    }
}
