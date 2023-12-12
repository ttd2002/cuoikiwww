package com.example.wwwcuoikyy.models;

public enum EmpRoles {
    ADMINISTRATION(0),
    STAFF(1),
    MANAGER(2),
    EXECUTIVE(4);
    private int role;

    EmpRoles(int role) {
        this.role = role;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
