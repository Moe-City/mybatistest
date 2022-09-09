package com.mybatistest.controller.day4.mission;

public class Conversation {
    private String man;
    private String statement;

    public void setMan(String man) {
        this.man = man;
    }

    public String getMan() {
        return man;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String showConversation(){
        return this.getMan()+": "+this.getStatement();
    }
}
