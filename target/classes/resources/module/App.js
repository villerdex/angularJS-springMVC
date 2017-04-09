'use strict';
(function() {

 angular
     .module('app', ['ngRoute', 'ngMaterial', 'md.data.table', 'ngAnimate', 'ngMessages', 'ngAria'])
     .config(function ($mdThemingProvider) {

         $mdThemingProvider.theme('default')
             .primaryPalette('red')
             .accentPalette('grey');
     })

})();