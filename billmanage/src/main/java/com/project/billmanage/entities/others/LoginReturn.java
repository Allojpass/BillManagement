package com.project.billmanage.entities.others;

public class LoginReturn {
    public String clientName;
    public String roleName;
    public int clientId;

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
