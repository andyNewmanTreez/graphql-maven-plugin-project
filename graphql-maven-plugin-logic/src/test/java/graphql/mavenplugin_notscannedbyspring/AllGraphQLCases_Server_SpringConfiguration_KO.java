/**
 * 
 */
package graphql.mavenplugin_notscannedbyspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.graphql_java_generator.plugin.conf.PluginMode;
import com.graphql_java_generator.plugin.test.helper.GraphQLConfigurationTestHelper;

import graphql.schema.GraphQLScalarType;

/**
 * The Spring configuration used for JUnit tests. In this one, no {@link GraphQLScalarType} : used to check that this
 * lack is properly handled.
 * 
 * @author etienne-sf
 */
@Configuration
@ComponentScan(basePackages = "com.graphql_java_generator", excludeFilters = {
		@Filter(type = FilterType.REGEX, pattern = ".*\\.GenerateRelaySchema.*"),
		@Filter(type = FilterType.REGEX, pattern = ".*\\.GenerateGraphQLSchema.*") })
public class AllGraphQLCases_Server_SpringConfiguration_KO extends AbstractSpringConfiguration {

	@Override
	protected void addSpecificConfigurationParameterValue(GraphQLConfigurationTestHelper configuration) {
		configuration.schemaFilePattern = "allGraphQLCases*.graphqls";
		configuration.mode = PluginMode.server;
		configuration.schemaPersonalizationFile = null;
		configuration.customScalars = null;
		configuration.separateUtilityClasses = false;
	}
}
