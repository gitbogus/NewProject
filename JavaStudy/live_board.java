//import org.kohsuke.github.GHIssue;
//import org.kohsuke.github.GHIssueComment;
//import org.kohsuke.github.GHIssueState;
//import org.kohsuke.github.GHRepository;
//import org.kohsuke.github.GitHub;
//import org.kohsuke.github.GitHubBuilder;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//public class live_board {
//    private static final String MY_PERSONAL_TOKEN = "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";
//
//    public static void main(String[] args) throws IOException {
//        Github github = new GithubBuilder().withOAuthToken(MY_PERSONAL_TOKEN).build();
//
//        // Repository 연결
//        GHRepository ghRepository = github.getRepository("bogusqa/firstproject");
//
//        //IssueState ALL, OPEN, CLOSED
//        List(GHIssue) issues = ghRepository.getIssues(GHIssueState.ALL);
//
//        for(int i = 0; i < issues.size(); i++){
//            List<GHIssueComment> comments = issues.get(i).getComments();
//            for(int j = 0; j < comments.size(); j++){
//                System.out.println(i+"번째 이슈의 코멘트" + j+"번째 유저이름 : "+comments.get(j).getUser().getLogin());
//                System.out.println(i+"번째 이슈의 코멘트" + j+"번째 유저이름 : "+comments.get(j).getbody());
//            }
//        }
//    }
//
//}