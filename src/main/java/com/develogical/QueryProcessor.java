package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        String lowerQuery = query.toLowerCase();
        if (lowerQuery.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (lowerQuery.contains("ian")){
            return "Ian is a Msc in software engineering student at Imperial College London";
        }
        return "";
    }
}
