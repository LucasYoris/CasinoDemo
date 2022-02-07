----Frontend----

- IDE IntelliJ IDEA Community Edition 2020.1.1 x64, JAVA 8, Maven, Selenium 4.0.0, Cucumber, Junit 4.12, cucumber extends reports, imagetyperzapi

- Exploradores soportados ---> Google chrome(Versión 98.0.4758.81), firefox

- Antes de ejecutar agregar libreria 'imagetyperzapi.jar' a modules:
    File > Proyect Structure > Modules > Dependencies(tab) > button '+' > JARs or Directories >
    seleccionar el .jar 'CasinoDemo\Librerias\imagetyperzapi.jar'

-Para ejecutar ir a la clase Testrunner:
        'CasinoDemo\src\test\java\runner\Testrunner.java'
        Presionar flecha verde a la izquierda de 'public class Testrunner {'

##NOTAS:
	REPORTE >>> (report.html) en la carpeta cucumber-reports
	        >>> Genera screenshot si el scenario falla

	DATOS TEST CASES >>> En el archivo Register.features

	CONFIGURACIÓN DE EJECUCIÓN >>> Se setea en la clase Config
	                        Headless >>> true or false
	                        Incognito >>> true or false

	DRIVER FACTORY >>> En el package browser_manager

	CUCUMBER OPTIONS y RUNNER >>> En la clase Testrunner

	LOCATORS >>> En el package Pages - se utiliza la nomenclatura "páginaAProbar"+Page.java

	STEPS >>> En el package Steps - se utiliza la nomenclatura "páginaAProbar"+Steps.java

	Se utilizó el patron POM para la creación del proyecto combinado con cucumber
	Se intentó utilizar la libreria Tesseract para resolver el captcha aunque...
	El captcha se terminó resolviendo con la api de https://www.imagetyperz.com/

##
	