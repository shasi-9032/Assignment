
      let input=document.getElementById("display")
      let expression=""
      function GetResult(ch)
      {
        expression=expression+ch
        document.getElementById("display").value=expression
      }

      function equal()
      {
        expression=eval(expression)
        document.getElementById("display").value=expression
      }

      function erase()
      {
        expression=""
        document.getElementById("display").value=expression
      }