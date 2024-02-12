package com.graphql.graphql.util;

import org.bouncycastle.crypto.generators.OpenBSDBCrypt;

import java.nio.charset.StandardCharsets;

public class HashUtil {


    public static void main(String[] args) {


        String password = "password";
        System.out.println(hashBcrypt(password));

        System.out.println(isBcryptMatch("password","$2y$05$XE7sbCPtTEfnay7sSFHtX.KiF6T4wUIJ0DF5X2yZQio1O5O7vwp6a"));
        //$2y$10$LC6wXDfzQi7DaTTDZFLQbejiWw8.kwiIaKfBVZs50SnWRRZMsM7M6

    }

    private static final String BCRYPT_SALT = "dontDoThisOnProd";

    public static Boolean isBcryptMatch(String original,String hashValue){

        return OpenBSDBCrypt.checkPassword(original,hashValue.toCharArray());
    }

    public static String hashBcrypt(String original) {
        return OpenBSDBCrypt.generate(original.toCharArray(),
                BCRYPT_SALT.getBytes(StandardCharsets.UTF_8), 5);
    }


}
