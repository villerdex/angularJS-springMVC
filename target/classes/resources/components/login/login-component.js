'use strict';
(function () {

    angular.module('app')
        .component('loginComponent', {
            templateUrl: '/components/login/login.html',
            controller: Controller
        });

    Controller.$inject = ['$routeParams'];

    function Controller($routeParams) {

    }
})();