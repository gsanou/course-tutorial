package id.semantics.helper;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utility {

    public static final String REMOTE_SPARQL_ENDPOINT = "http://128.131.169.17:7200";
    public static final String REMOTE_REPO_ID = "course";

    public static final String NS_EXAMPLE = "http://semantics.id/ns/example/";
    public static final String NS_MOVIE = "http://semantics.id/ns/example/movie#";

    public static final String INPUT_FILE = "./input/graph/movie.ttl";
    public static final String INSTANCE_FILE = "./input/graph/movie-instances.ttl";

    public static final String Q1_SELECT = "./input/query/Q1_SELECT_allmovies.sparql";
    public static final String Q2_SELECT = "./input/query/Q2_SELECT_oldeststudio.sparql";
    public static final String Q3_CONSTRUCT = "./input/query/Q3_CONSTRUCT_family.sparql";
    public static final String OUTPUT_FILE = "./output/output.ttl";

    public static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
