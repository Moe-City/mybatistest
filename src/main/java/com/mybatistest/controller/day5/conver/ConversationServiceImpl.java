package com.mybatistest.controller.day5.conver;

public class ConversationServiceImpl implements Conversation{
    private String man;
    private String statement;

    public ConversationServiceImpl() {
    }

    public ConversationServiceImpl(String man, String statement) {
        this.man = man;
        this.statement = statement;
    }

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
