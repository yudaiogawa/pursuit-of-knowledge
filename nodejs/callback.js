/*
    callback function
*/

var morning = function(callback) {
    console.log("morning...");
    if (callback) {
        callback();
    }
};

var noon = function(callback) {
    console.log("noon...");
    if (callback) {
        callback();
    }
};

var night = function(callback) {
    console.log("night...");
    if (callback) {
        callback();
    }
};

morning(function() {
    noon(function() {
        night();
    });
});
