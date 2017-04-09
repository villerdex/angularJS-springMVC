'use strict';
(function(){

     angular
        .module('app')
        .component('appWrapper', {
            transclude: true,
            templateUrl : '/components/app-wrapper/app-wrapper.component.html',
            controller : Controller
    });

    Controller.$inject = [ ];
    function Controller(){

        activate();


        function activate(){
        }

    }

})();