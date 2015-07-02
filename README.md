Bootstrap for Vaadin
====================

Integrating Bootstrap CSS with Vaadin (proof-of-concept). It does not try to bring Bootstrap JavaScript components/widgets to Vaadin. The goal is just to style Vaadin components to look like Bootstrap.

Using the default bootstrap.css as a base, and then using the default Sass compiler to extend Vaadin class names from the Bootstrap class names. The Vaadin Sass compiler throws a bunch of errors from the Bootstrap CSS at the time of writing, so another Sass compiler should be used instead (Ruby, LibSass, etc.)

Work-in-progress demo
=====================

Current progress can be seen here (can be out of date if I forget to update the demo after a commit):  
http://jouni.app.fi/bootstrap/

Contribute
==========

This project is more or less just a stub which be built upon if you wish to use Bootstrap CSS, and I’m more than open for pull requests which style more components. Look inside the files in the `css` folder to see how the integration is done.

To update Bootstrap, replace the `bootstrap.scss` file in the `vendor` folder with the latest version of the compiled Bootstrap CSS (rename the file from `.css` to `.scss` so that Sass can import it correctly).
