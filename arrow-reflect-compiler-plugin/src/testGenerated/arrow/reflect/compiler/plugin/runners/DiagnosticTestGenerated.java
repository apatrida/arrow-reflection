

package arrow.reflect.compiler.plugin.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link arrow.reflect.compiler.plugin.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("src/testData/diagnostics")
@TestDataPath("$PROJECT_ROOT")
public class DiagnosticTestGenerated extends AbstractDiagnosticTest {
    @Test
    public void testAllFilesPresentInDiagnostics() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("src/testData/diagnostics"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("immutable_test.kt")
    public void testImmutable_test() throws Exception {
        runTest("src/testData/diagnostics/immutable_test.kt");
    }

    @Test
    @TestMetadata("log_test.kt")
    public void testLog_test() throws Exception {
        runTest("src/testData/diagnostics/log_test.kt");
    }

    @Test
    @TestMetadata("pure_test.kt")
    public void testPure_test() throws Exception {
        runTest("src/testData/diagnostics/pure_test.kt");
    }

    @Test
    @TestMetadata("sample_test.kt")
    public void testSample_test() throws Exception {
        runTest("src/testData/diagnostics/sample_test.kt");
    }
}
