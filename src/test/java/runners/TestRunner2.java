package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(//burada testRunner2 ile Runner ayni yerde raporlama yapmasin diye plugin icerinde reports2
        //cucumber2 seklinde 2'yi ekleyerek iki ayri rapor'u elde etmis olduk
        plugin = {"html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"},
        features="src/test/resources/features",
        glue="stepDefinitions",
        tags="@pr2",
        dryRun=false
)

public class TestRunner2 {


}
