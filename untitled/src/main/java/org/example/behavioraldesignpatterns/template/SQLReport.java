package org.example.behavioraldesignpatterns.template;

public class SQLReport extends ReportTemplate{
    @Override
    protected void readReport() {
        System.out.println("Reading sql report...");
    }
}
