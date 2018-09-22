function zafira()
		{
			var username = document.getElemeneById('username')
			var email1 = document.getElemeneById('email')
			var nomor = document.getElemeneById('nomortelp')
			var number =  /^[0-9]+$/
			var regex = /[a-z]/
			var email = /[a-zA-Z0-9._-]+@[a-zA-Z0-9_-]+\.[a-z]+/

			if(username.value == '')
			{
				alert('Anda belum mengisi Username')
				username.focus()
			}
			else if(!(regex.test(username.value)))
			{
				alert('username harus huruf kecil')
				username.focus()
			}
			else if(email.value == '') 
			{
				alert('email belum diisi')
				email.focus()
			}
			else if(!(email.test(email1.value))) 
			{
				alert('Format email salah')
				email1.focus()
			}
			else if(nomor.value == '')
    		{
        		alert('Anda belum mengisi nomor')
        		nomor.focus()
   			}
    		else if(!(number.test(nomor.value)))
    		{
        		alert('Nomor Telepon Harus Angka')
        		nomor.focus()
    		}
		}