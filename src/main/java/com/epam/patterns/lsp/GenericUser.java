package com.epam.patterns.lsp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

class GenericUser {
    protected Map<String, Boolean> accessRights ;
    private Set<String> protectedRights;

    GenericUser(HashSet<String> protectedRights) {
        this.protectedRights = protectedRights;
        this.accessRights = new HashMap<>();
    }

    void setupAccessRight(String right, boolean value) {
        if(!protectedRights.contains(right)) {
            accessRights.put(right, value);
        }
    }

    boolean getValueOfAccessRight(String right) {
        return accessRights.getOrDefault(right, false);
    }

}
