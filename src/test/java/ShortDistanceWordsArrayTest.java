import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortDistanceWordsArrayTest {

    @Test
    public void firstArray(){

        //Given
        String [] words= {"beaver","cat","fox"};
        String word1 = "beaver";
        String word2 = "cat";

        //When
        long expectedResult = ShortDistanceWordsArray.solution(words, word1, word2);

        //Then
        assertEquals(expectedResult, 1);
    }

    @Test
    public void secondArray(){

        //Given
        String [] words= {"beaver","cat","fox"};
        String word1 = "fox";
        String word2 = "fox";

        //When
        long expectedResult = ShortDistanceWordsArray.solution(words, word1, word2);

        //Then
        assertEquals(expectedResult, 0);
    }

    @Test
    public void thirdArray(){

        //Given
        String [] words= {"dog","beaver","cat","fox","squirrel","parakeet"};
        String word1 = "squirrel";
        String word2 = "beaver";

        //When
        long expectedResult = ShortDistanceWordsArray.solution(words, word1, word2);

        //Then
        assertEquals(expectedResult, 3);
    }

    @Test
    public void fourthArray(){

        //Given
        String [] words= {"cUX7Jqe7CW","vRXA47sJYT","g8IwLr5rMm","aMqRpMIU5L","VNlzgfNvvv","7mDzksAEy0","Ks2cep4cnv",
                "1XSMBNLTrI","iAlJeCtEGr","nHX2c5H9uq","TI9BCkPWFo","sjtIvd8aT2","zAR4CMMPh6","Vf3eJXcRSL","fVbTMaTFwe",
                "UBaiii48cu","rliK6tLXJJ","oVB1mOvkA8","eNltZmTxw9","vYoeeuOsX1","XOeh9FmxmD","10NZFNbdzG","i7YX8sMQfR",
                "OVz6850u11","t74nWv3hK8","1FQdNpKk5M","XEoRPPOci4","AB7WcC7JFj","CFeAtbkWcD","kq6YluTkPF","ip0LUZ7Yet",
                "oglChqea7J","qL6Vy8z4oY","aLBkaGer4x","kY4qYdUqgQ","fLHuCtijTl","HD3rax1QjV","pYaGu7UdqX","CWm05ju9z6",
                "TgEuZUiwz0","NqJDRVp7TO","i5Bjt1XRQQ","q0Jw6pLIGk","hamgbeiCig","CZjWw30B4W","bRd5MSMXOq","noYlZ8VZll",
                "YZDmDpci82","ydWXzWHp5X","E7idQpRYli","WOZNNvxOvm","Q43Vp6685v","YTyUVKyAsM","xJQQAiwJwj","6mhkyg5UmN",
                "rFlncHtiRe","Se7l8GLj3g","Ckpn1ZeiAg","RzzlNvmbOv","Gp39Jiob8k","vgNUjjk1aP","hNVfZdlivm","ZSWO0BQARc",
                "4EcnjCKzEh","89ZDYkgHyL","SUUfwdjecF","dq3dEYXcfd","KoxxCg7qiN","bMk79sS7qT","gbgwIQjGez","F1mLyjftug",
                "sLSLhmZMp7","QaaMgRPeYy","017viMCmDt","jyiv0PptBQ","DwIX5q43op","Xb5t6aBklf","Wq5ayj5yky","BvbmF6QG7k",
                "e7YsxLlR1A","63LurYqgtj","GP0ftDn4CR","bo7YynFuxb","HCfJKgKpw0","jk3CV7q9cr","d6dek71XpX","4Qz3490Ydr",
                "8LqJ74ZOx2","q2NVVnwPLH","28MA1Cex6Z","jtXzePF02T","OvqtnLNKpG","mliS5Dz1QR","RrhuPW6GQ2","fArYhBcKUC",
                "MEaxpcOqOE","0r0mOkV1C0","NxgqbZoMZY","jWDrH8a4NG","93UNbAi65G","o4fWXsvaFJ","rA7SfOSFKg","zzvk4InW4H",
                "3jFqWkPf5Y","JTRYGRJAL9","1DhEz1ZmGS","9zAlt9uvAB","559t2ZhmDU","4MLVhul9mL","y3pvJULYBA","YV0Q8IPywY",
                "oIfrsBSehS","cD7c8rQlqX","bFkeHTzaRL","aFcqftGKqL","tMeOIVb3qp","IbdECU87kI","1WlbYpe1Nx","2ggomWwitQ",
                "lUGfdz5swN","Mc9Cv2W07e","w3IR8BFExS","Wg1zOJEOdt","k5EAQLvx0U","te4RAkfiZT","1sbc9JZY94","Bu1msDxsjP",
                "uvqcKuo4Gm","dr22OG1hwg","d46KPgepLR","8UbH2nHsxF","rpyomrZcwu","neWlOyOIhu","xfjgCJb3iq","IIy6pzhegp",
                "wb6rweBHmm","pom7mlFBPl","WO3xc30lpr","DXTKrPoqSY","67lYDiHKZg","RMdgFMsifg","j0s26fnaGm","8zTHulnZJ3",
                "0kuWJZ0qr3","OiEjBfY2UQ","ePJWvYfDeX","ifI8fT38lX","XWjjdSgzaK","BCZRHI7elG","RMvulPzOC8","THL0eFKuMo",
                "GIuaDps1oQ","dqtdEreq2o","cyijrwOOoc","1PsQd9ua5a","IINH7TtHtl","Dh71ZvV2HA","z4LyPSsxBF","gUAzvfIS59",
                "kVPMjWkEb7","ITHfLGjiXG","hrWuAy5vDo","w4oRFCuaes","HtmAUHvzM2","mGG9sdZgFn","mEIUi9XoMZ","L6cR0JXjmu",
                "aDeeLVmaxd","giGdwPJSI0","RNUkI44nox","4BHJUDRJXb","ak1KmeF7rQ","M5RiJBDyPE","j05LL0Opej","g20XvrF2jm",
                "S1z9mxrWDk","NTxdAdeOjV","gGZnLaFQ24","7SYonrd9xI","yjATgAk0mb","n6gDdqs3qf","VXjVk7T3gR","TKnWC4wQY3",
                "GZcRSWo6Fx","Ikn8AbzXyE","L1NWz4eaaU","oD2fJEQOYN"};
        String word1 = "Bu1msDxsjP";
        String word2 = "1sbc9JZY94";

        //When
        long expectedResult = ShortDistanceWordsArray.solution(words, word1, word2);

        //Then
        assertEquals(expectedResult, 1);
    }

    @Test
    public void fifthArray(){

        //Given
        String [] words= {"3gDLabgZIR","TEc2oSQE8N","OlowtgHTg0","lt8dzZVITO","CWBsmVvSCR","KygOhkjGlj","2TrtOxinzO",
                "EcN38ILvJ0","2PkOblWsaG","gjGklfu5sJ","tkoKj5rOWC","PwV0UWQlvT","htXeuDMUjS","nNBOu3hf4U","mBT10EeOFq",
                "pWRdF5RExG","zaVEVOhaKG","SQ9MofY8J6","px3sOJqaFv","NRRhdtDKK7","BXrMCRw8Yz","pAyVeIs0Vp","MsWfpK11tO",
                "8EYGNBNhGv","cydKm6sG37","LHbYMN7mQY","dIUjwSb1mT","HzcMadYO2c","ppNLbQBhQ6","6BBP3jdHOq","cBercrmMoy",
                "s0jDpyMSqt","geHU8C5Acz","zSunmrcWsW","Tghp2onkgE","AymPtISr0D","gcS5oV9gZj","o9R1eNpH2F","3ojMdpQotf",
                "3uyrJfMyzf","C5Or7hdqW0","zx1pomSjEB","NAgoV4SM0c","2ZuUWx9a4S","czG99V1587"};
        String word1 = "2ZuUWx9a4S";
        String word2 = "3uyrJfMyzf";

        //When
        long expectedResult = ShortDistanceWordsArray.solution(words, word1, word2);

        //Then
        assertEquals(expectedResult, 4);
    }

    @Test
    public void sixthArray(){

        //Given
        String [] words= {"VfA1xsDrB5","5USTmHyC56","EJPJqEDPx9","ODEm7fP16t","iQVGRrhZeX","C6sNIle22X","yeD2DOB9Dr",
                "xSSfFn5wKX","G2QyCjtfso","qiUNvdf6j7","yCjP575nm3","xUeimqIUW9","3kzHel4rm2","uaOjUSG93Q","EfZubFT0hC",
                "6Z2RoVxaJu","skHN6RF7ia","OAc8lClwCi","Xs5sy64p2p","NOGH7bVkPz","0ph4tK1NcW","ukblSI4gN8","XmYNJq9HrT",
                "q1ft1yrqMO","V9KiFfR01c","pS5EMAqO9l","jl0EypvcUr","VYZAqAIVLc","YKA1GSgxlk","4RvNnOuZMf","3lreIXkE81",
                "tFgStK2Si4","FPqGmmjwoi","DDWEWV5Z3T","K8nUaJZuKA","AzK93ZGtkD","D1JJQerHJR","jJj0PZyfq1","sPpzMqF3PM",
                "knimiqQgDk","bI13J5olpW","ATEmMAnRS8","z09bVOV8eN","ZUmt3IznUb","riUCEhnXIl","MjctEgJcCK","5E4FRNPHUI",
                "wC4wCpxioG","LbPdvOEVeT","tPY7BSmVhK","SmJIeIbNQI","9gUxH64HLq","dywdv18cVi","k01fRG6vqO","b7Tvjj4fBC",
                "TKeZeFjZ3x","cHzqIGhytu","XuFgGQc6zG","HadMxjn8A3","5Gdpg5itdY","irsVbD1UZp","3ip2CfjZX3","XjUVKXqUJg",
                "nBVZfs8rsE","oeK6Hbe99d","vVwKQ2MO1h","H8j8IeMtBh","1EtOIxcTvt","FJmTcyNSOR","j7qCFzkBVU","x0kfLE6JiE",
                "GrZlS4zVQA","e6lE1NZJ7m","7HcikXOfbf","wL9igK9H79","zdDrk5yVrr","BEBl5pjqhu","JqBKW5bjY5","HNC72aRgLk",
                "ydhUnJhAG4"};
        String word1 = "tPY7BSmVhK";
        String word2 = "NOGH7bVkPz";

        //When
        long expectedResult = ShortDistanceWordsArray.solution(words, word1, word2);

        //Then
        assertEquals(expectedResult, 30);
    }
}