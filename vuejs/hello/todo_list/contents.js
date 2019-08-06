var app = new Vue({
  el: '#app',
  data: {
    addTxt: '',
    list: [],
    uniqKey: 0,
  },
  methods: {
    addToDo() {
      if (this.addTxt) {
        this.list.unshift({
          'txt': this.addTxt,
          'id': this.uniqKey + 1,
          'flag' : true
        });
        this.addTxt = '';
        this.uniqKey++;
      }
    },
    deleteToDo(id) {
      var deleteIdx = '';
      var chk = confirm('Are you OK?');
      if (chk === true) {
        this.list.some(function(value, idx) {
          if (value.id === id) {
            deleteIdx = idx;
          }
        });
        this.list.splice(deleteIdx, 1);
      }
    },
    editToDo(id) {
      var newTxt = window.prompt('Update with the following content :)');
      if (newTxt === '') {
        alert('Please enter :(');
      } else if (newTxt !== null) {
        this.edit(id, newTxt);
      }
    },
    edit(id, txt) {
      var editIdx = '';
      this.list.some(function(value, idx) {
        if (value.id === id) {
          editIdx = idx;
        }
      });
      this.list[editIdx].txt = txt;
    },
    changeToDo(id) {
      var changeIdx = '';
      this.list.some(function(value, idx) {
        if (value.id === id) {
          changeIdx = idx;
        }
      });
      this.list[changeIdx].flag = this.change(changeIdx);
    },
    change(changeIdx) {
      if (this.list[changeIdx].flag === true) {
        return false;
      } else {
        return true;
      }
    }
  }
});
