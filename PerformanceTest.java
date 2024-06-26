Êþº¾   A É
      java/lang/Object <init> ()V   B@ 
      PerformanceTest runPerformanceTests (I)V  java/util/ArrayList
  
     generateRandomNumbers (I)Ljava/util/List;      run &(Ljava/util/List;)Ljava/lang/Runnable;
     measureTime (Ljava/lang/Runnable;)J
   ! " # $ java/lang/Long valueOf (J)Ljava/lang/Long; & ' ( ) * java/util/List add (Ljava/lang/Object;)Z      	 / 0 1 2 3 java/lang/System out Ljava/io/PrintStream; 5 0Average time to find min for %d elements: %d ms

 7 8 9 # : java/lang/Integer (I)Ljava/lang/Integer;
  < = > average (Ljava/util/List;)J
 @ A B C D java/io/PrintStream printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; F 0Average time to find max for %d elements: %d ms
 H 'Average time to sum %d elements: %d ms
 J ,Average time to multiply %d elements: %d ms
 L java/util/Random
 K 
 K O P Q nextInt (I)I
 / S T U currentTimeMillis ()J W X Y   java/lang/Runnable & [ \ ] iterator ()Ljava/util/Iterator; _ ` a b c java/util/Iterator hasNext ()Z _ e f g next ()Ljava/lang/Object;
   i j U 	longValue & l m n size ()I
 p q r s > NumberProcessor _mult
 p u v > _sum
 p x y z _max (Ljava/util/List;)I
 p | } z _min TRIALS I ConstantValue    Code LineNumberTable LocalVariableTable this LPerformanceTest; main ([Ljava/lang/String;)V args [Ljava/lang/String; sizes [I StackMapTable   numbers Ljava/util/List; trial timesMin timesMax timesSum 	timesMult LocalVariableTypeTable %Ljava/util/List<Ljava/lang/Integer;>; "Ljava/util/List<Ljava/lang/Long;>; i random Ljava/util/Random; 	Signature ((I)Ljava/util/List<Ljava/lang/Integer;>; function Ljava/lang/Runnable; 	startTime J time times total %(Ljava/util/List<Ljava/lang/Long;>;)J lambda$runPerformanceTests$3 (Ljava/util/List;)V lambda$runPerformanceTests$2 lambda$runPerformanceTests$1 lambda$runPerformanceTests$0 
SourceFile PerformanceTest.java BootstrapMethods  ±
  ² « ¨ ´
  µ ª ¨ ·
  ¸ © ¨ º
  » § ¨ ½
 ¾ ¿ À Á Â "java/lang/invoke/LambdaMetafactory metafactory Ì(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; InnerClasses Å %java/lang/invoke/MethodHandles$Lookup Ç java/lang/invoke/MethodHandles Lookup !       ~        
        /     *· ±                        	       ª     ?¼
YèOY'OYOYOY	OL+M,¾>6¢ ,.6¸ 
§ÿì±           
   3  8  >        3  m     ?               ÿ '      ø  
      þ    » Y· L» Y· M» Y· N» Y· :6¢ `¸ :+º   ¸ ¸ ¹ % W,º +  ¸ ¸ ¹ % W-º ,  ¸ ¸ ¹ % Wº -  ¸ ¸ ¹ % W§ÿ² .4½ Y¸ 6SY+¸ ;¸ S¶ ?W² .E½ Y¸ 6SY,¸ ;¸ S¶ ?W² .G½ Y¸ 6SY-¸ ;¸ S¶ ?W² .I½ Y¸ 6SY¸ ;¸ S¶ ?W±       B           !  +  1  E  Y  m      ¦   Ä ! â " #    H  1 Q    $ d      m     ú     ò     ê    ! á       4  1 Q     ú     ò     ê    ! á        ÿ $  & & & &  ú c 
       ±     .» Y· L» KY· MM>¢ +,¶ N¸ 6¹ % W§ÿé+°           &  '  (  ) & ( , +    *         . m     &               &        þ  & Kú       
       L     ¸ R@*¹ V ¸ Re­           /  0 
 1                ¡ ¢  
 = >     ¤     2	@*¹ Z N-¹ ^  -¹ d À  ¶ h7a@§ÿä*¹ k m­           5  6   7 % 8 ( 9          £ ¢    2 ¤     0 ¥ ¢         2 ¤        ý 	 _ú      ¦
 § ¨     0     *¸ oX±                       
 © ¨     0     *¸ tX±                       
 ª ¨     0     *¸ wW±                       
 « ¨     0     *¸ {W±                         ¬    ­ ®   *  ¼  ¯ ° ¯ ¼  ¯ ³ ¯ ¼  ¯ ¶ ¯ ¼  ¯ ¹ ¯ Ã   
  Ä Æ È 