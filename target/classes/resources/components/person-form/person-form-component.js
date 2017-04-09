'use strict';
(function () {
    angular
        .module('app')
        .component('personForm', {
                templateUrl: '/components/person-form/person-form-component.html',
                bindings: {
                    data: '=',
                    callBack: '='
                },
            controller: Controller
        });

    Controller.$inject = ['RestService'];

    function Controller(RestService) {
        var controller = this;

        controller.save = save;
        controller.back = back;
        controller.update = update;
        controller.isUpdate = false; // flag if update or add

        // get all the value of data
        controller.person = controller.data.person;


        active();

        function active() {

            if(controller.person){
                fillForm(controller.person);
                controller.isUpdate = true;
            }

        }
        
        function fillForm(person) {
            controller.person = person;
        }


        function back() {
            console.log('back');
            controller.callBack.getPersons();
            controller.data.show = false;
        }

        function save(data) {

            var response = RestService.post('/person/addPerson', data, {});

            response.then(function (response) {
                console.log(response)
            }), function (result) {
                console.log(result)
            };

        }

        function update(data) {

            var response = RestService.post('/person/updatePerson', data, {});

            response.then(function (response) {
                console.log(response)
            }), function (result) {
                console.log(result)
            };

        }

    }
})();