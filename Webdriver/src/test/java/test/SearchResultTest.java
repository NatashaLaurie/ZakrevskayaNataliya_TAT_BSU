package test;


import org.testng.annotations.Test;
import page.MainPage;
import service.TestDataReader;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultTest extends CommonConditions {

    public static String COMMON_RESULTS_SEARCH_QUERY = TestDataReader.getTestData("testdata.common_results_search_query");
    public static String EXPECTED_COMMON_SEARCH_RESULT_SUBSTRING = TestDataReader.getTestData("testdata.substring_of_searched_items");
    public static String EMPTY_RESULTS_SEARCH_QUERY = TestDataReader.getTestData("testdata.empty_results_search_query");
    private static final String EXPECTED_EMPTY_SEARCH_RESULT_HEADER = TestDataReader.getTestData("testdata.empty_search_result_header_text");


    @Test
    public void handleEmptySearchResult() {
        String searchResultHeaderText = new MainPage(driver)
                .openPage()
                .searchForTerms(EMPTY_RESULTS_SEARCH_QUERY)
                .getEmptySearchResultHeaderText();

        assertThat(searchResultHeaderText).contains(EXPECTED_EMPTY_SEARCH_RESULT_HEADER);
    }

    @Test
    public void handleCommonSearchResult() {
        List<String> searchedResultsText = new MainPage(driver)
                .openPage()
                .searchForTerms(COMMON_RESULTS_SEARCH_QUERY)
                .getDescriptionOfCommonSearchResults();
        assertThat(searchedResultsText).allSatisfy(elem -> assertThat(elem).contains(EXPECTED_COMMON_SEARCH_RESULT_SUBSTRING));

    }
}
