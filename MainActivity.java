FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

btnDeleteAccount.setOnClickListener(v -> {
    user.delete().addOnSuccessListener(unused -> {
        Toast.makeText(this, "Account Deleted", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, LoginActivity.class));
        finish();
 
    
    db.collection("books")
  .document(book.id)
  .update("title", newTitle, "author", newAuthor);
db.collection("books")
  .document(book.id)
  .delete();
    });
});


