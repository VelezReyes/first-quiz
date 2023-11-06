# Implementaciones de seguridad

Este documento describe las implementaciones de seguridad que se deben revisar en un sistema.

## Revisión de infraestructura

En el modelo de infraestructura se revisará si tiene un diseño adecuado que aporte a la seguridad, donde tenga implementados módulos para controlar el acceso indebido a los sistemas por medio de la red, y revisar si se ha implementado alguna solución para la observabilidad de los sistemas (logs, trazas).

**Requisitos**

* El diseño de la infraestructura debe contemplar la seguridad como un aspecto fundamental.
* Los módulos de control de acceso deben ser efectivos para evitar el acceso no autorizado a los sistemas.
* Debe haber una solución para la observabilidad de los sistemas que permita identificar y corregir fallas de seguridad.

## Aplicación móvil

En cuanto a la aplicación móvil, de Android e iOS, se tiene que revisar qué implementaciones de seguridad tiene la aplicación, como validaciones de datos en formularios.

**Requisitos**

* La aplicación debe tener implementaciones de seguridad que protejan la información sensible de los usuarios.
* Los formularios de la aplicación deben tener validaciones que eviten la entrada de datos maliciosos.

## Página web

En la revisión de la página web, se debe realizar pruebas de validación de los formularios de ingreso, registro y otros, con el fin de encontrar fallas de seguridad como inyección SQL, o intentos de fuerza bruta. Algo bueno que se tiene es el uso de tecnologías actuales como Next.js, que proporciona ciertas características de seguridad en el manejo de las peticiones.

**Requisitos**

* La página web debe tener implementaciones de seguridad que protejan la información sensible de los usuarios.
* Los formularios de la página web deben tener validaciones que eviten la entrada de datos maliciosos.
* Debe haber una solución de seguridad para la página web que proteja contra ataques como inyección SQL o fuerza bruta.

## Base de datos

En cuanto a la base de datos, se revisará la forma en que se está almacenando información sensible de los usuarios, verificar si la contraseña de los usuarios se guarda de forma cifrada, además se debería revisar y restringir accesos a usuarios no autorizados.

**Requisitos**

* La información sensible de los usuarios debe estar almacenada de forma segura en la base de datos.
* Las contraseñas de los usuarios deben estar cifradas en la base de datos.
* El acceso a la base de datos debe estar restringido a usuarios autorizados.

## APIs

En el desarrollo de las APIs, se debe garantizar la seguridad en el acceso a las APIs, ya que su uso debe ser restringido. Se debe revisar qué tipo de autenticación se usa, por ejemplo OAuth 2.0, además del cifrado de datos y métodos usados para el envío y recepción de información por parte de los clientes.

**Requisitos**

* El acceso a las APIs debe estar restringido a usuarios autorizados.
* Las APIs deben usar un tipo de autenticación seguro, como OAuth 2.0.
* Los datos transmitidos a través de las APIs deben estar cifrados.

## Empleados

En cuanto a los empleados, es de gran preocupación que los 12 ingenieros tengan acceso completo al sistema, cosa que no debería ser así. Se debería definir ciertos rangos de acceso y así, según su rol en la empresa, tener acceso a cierta información limitada, ya que todos pueden ser víctimas en cualquier momento.

**Requisitos**

* Los empleados deben tener acceso al sistema limitado a su rol en la empresa.
* Debe haber una política de seguridad que regule el acceso de los empleados al sistema.

## Conclusiones

odas estas revisiones de la seguridad permiten que los sistemas sean más confiables de cara al usuario, y un gran alivio para las empresas que se tomen el tiempo y esfuerzo de hacer sistemas más seguros y evitar a futuro dolores de cabeza con el filtrado de información.
