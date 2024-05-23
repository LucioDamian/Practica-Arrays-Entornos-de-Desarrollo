package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ MaximaNotaTest.class, MedianaNotasTest.class, MinimaNotaTest.class, Prueba.class })
public class AllTests {

}
