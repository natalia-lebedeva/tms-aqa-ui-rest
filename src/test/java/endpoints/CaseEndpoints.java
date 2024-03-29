package endpoints;

public interface CaseEndpoints {
    String ADD_CASE = "index.php?/api/v2/add_case/%d";
    String GET_CASE = "index.php?/api/v2/get_case/%d";
    String GET_CASES = "index.php?/api/v2/get_cases/%d";
    String GET_HISTORY = "index.php?/api/v2/get_history_for_case/%d";
    String COPY_CASES = "index.php?/api/v2/copy_cases_to_section/%d";
    String MOVE_CASES = "index.php?/api/v2/move_cases_to_section/%d";
    String UPDATE_CASE = "index.php?/api/v2/update_case/%d";
    String DELETE_CASE = "index.php?/api/v2/delete_case/%d";
}
