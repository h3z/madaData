package dropwizard;

import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.skife.jdbi.v2.DBI;

import dropwizard.resources.GraphQLResource;
import dropwizard.resources.PeopleResource;

public class DropWizardApplication extends Application<DropWizardConfiguration> {

	public static void main(String[] args) throws Exception {
        new DropWizardApplication().run(args);
    }


    @Override
    public String getName() {
        return "configuration";
    }

    @Override
    public void initialize(Bootstrap<DropWizardConfiguration> bootstrap) {
        // Enable variable substitution with environment variables
    }

    @Override
    public void run(DropWizardConfiguration configuration, Environment environment) throws ClassNotFoundException {
		final DBIFactory factory = new DBIFactory();
	    DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "postgresql");
    	environment.jersey().register(new GraphQLResource(jdbi));
    	environment.jersey().register(new PeopleResource(jdbi));
    }
    
    
}
