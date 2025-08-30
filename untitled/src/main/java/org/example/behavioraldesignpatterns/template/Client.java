package org.example.behavioraldesignpatterns.template;

public class Client {
    public static void main(String[] args) {

        SQLReport sqlReport = new SQLReport();
        TestReport testReport = new TestReport();

        sqlReport.generateReport();
        testReport.generateReport();
    }
}
