----Frontend----

    - IDE IntelliJ IDEA Community Edition 2020.1.1 x64, JAVA 8, Maven, Selenium 4.0.0, Cucumber, Junit 4.12,
    cucumber extends reports, imagetyperzapi.jar

    - Exploradores soportados ---> Google chrome(Versión 98.0.4758.81), firefox

    -Se automatizaron 2 features
        Registration ---> registro de usuario ok
        Contacts ---> envio de mensaje de consulta ok

-----------------------------------------------------------------------------------------------------------------------
##IMPORTANTE
-Se utiliza libreria imagetyperzapi.jar para la decodificacion de los captcha de ambos features
 Antes de ejecutar agregar libreria 'imagetyperzapi.jar' a 'modules' de las siguiente forma en IntelliJ:

            File > Proyect Structure > Modules > Dependencies(tab) > button '+' > JARs or Directories >
            seleccionar el .jar 'CasinoDemo\Librerias\imagetyperzapi.jar'

-Para ejecutar ir a la clase Testrunner:
        'CasinoDemo\src\test\java\runner\Testrunner.java'
        Presionar flecha verde a la izquierda de 'public class Testrunner {'
-----------------------------------------------------------------------------------------------------------------------
##NOTAS:
	REPORTE >>> Se genera reporte de la ejecución (report.html) en la carpeta cucumber-reports
	        >>> Genera screenshot si el scenario falla

	DATOS DE LOS TEST CASES >>> En los archivos .feature

	CONFIGURACIÓN DE EJECUCIÓN >>> Se setea en la clase Config
	        Parametros configurables:
	                            Headless >>> true or false
	                            Incognito >>> true or false
	                            waitSeconds >>> implicit wait en segundos

	DRIVER FACTORY >>> Se encuentra en el package browser_manager

	CUCUMBER OPTIONS y RUNNER >>> Se encuentra en la clase Testrunner

	LOCATORS >>> Package Pages - se utiliza la nomenclatura "páginaAProbar"+Page.java

	STEPS >>> Package Steps - se utiliza la nomenclatura "páginaAProbar"+Steps.java

	Se utilizó el patron POM para la creación del proyecto combinado con cucumber
	Se intentó utilizar la libreria Tesseract para resolver el captcha aunque...
	El captcha se terminó resolviendo con la api de https://www.imagetyperz.com/
-----------------------------------------------------------------------------------------------------------------------
	