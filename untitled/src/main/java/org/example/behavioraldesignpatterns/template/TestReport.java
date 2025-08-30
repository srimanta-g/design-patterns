package org.example.behavioraldesignpatterns.template;

public class TestReport extends ReportTemplate{
    @Override
    protected void readReport() {
        System.out.println("Reading test report...");
    }
}
