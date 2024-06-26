Êþº¾   A Å
      java/lang/Object <init> ()V   B@ 
      PerformanceTestMedian runPerformanceTests (I)V  java/util/ArrayList
  
     generateRandomNumbers (I)Ljava/util/List;      run &(Ljava/util/List;)Ljava/lang/Runnable;
     measureTime (Ljava/lang/Runnable;)J
   ! " # $ java/lang/Long valueOf (J)Ljava/lang/Long; & ' ( ) * java/util/List add (Ljava/lang/Object;)Z      	 / 0 1 2 3 java/lang/System out Ljava/io/PrintStream; 5 /Median time to find min for %d elements: %d ms

 7 8 9 # : java/lang/Integer (I)Ljava/lang/Integer;
  < = > median (Ljava/util/List;)J
 @ A B C D java/io/PrintStream printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; F /Median time to find max for %d elements: %d ms
 H &Median time to sum %d elements: %d ms
 J +Median time to multiply %d elements: %d ms
 L java/util/Random
 K 
 K O P Q nextInt (I)I
 / S T U currentTimeMillis ()J W X Y   java/lang/Runnable
 [ \ ] ^ _ java/util/Collections sort (Ljava/util/List;)V & a b c size ()I & e f g get (I)Ljava/lang/Object;
   i j U 	longValue       
 n o p q > NumberProcessor _mult
 n s t > _sum
 n v w x _max (Ljava/util/List;)I
 n z { x _min TRIALS I ConstantValue    Code LineNumberTable LocalVariableTable this LPerformanceTestMedian; main ([Ljava/lang/String;)V args [Ljava/lang/String; sizes [I StackMapTable   numbers Ljava/util/List; trial timesMin timesMax timesSum 	timesMult LocalVariableTypeTable %Ljava/util/List<Ljava/lang/Integer;>; "Ljava/util/List<Ljava/lang/Long;>; i random Ljava/util/Random; 	Signature ((I)Ljava/util/List<Ljava/lang/Integer;>; function Ljava/lang/Runnable; 	startTime J times middle %(Ljava/util/List<Ljava/lang/Long;>;)J lambda$runPerformanceTests$3 lambda$runPerformanceTests$2 lambda$runPerformanceTests$1 lambda$runPerformanceTests$0 
SourceFile PerformanceTestMedian.java BootstrapMethods  ­
  ® § _ °
  ± ¦ _ ³
  ´ ¥ _ ¶
  · ¤ _ ¹
 º » ¼ ½ ¾ "java/lang/invoke/LambdaMetafactory metafactory Ì(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; InnerClasses Á %java/lang/invoke/MethodHandles$Lookup Ã java/lang/invoke/MethodHandles Lookup !       | }  ~     
        /     *· ±                        	       ª     ?¼
YèOY'OYOYOY	OL+M,¾>6¢ ,.6¸ 
§ÿì±              3  8  >        3  b }    ?               ÿ '      ø  
      þ    » Y· L» Y· M» Y· N» Y· :6¢ `¸ :+º   ¸ ¸ ¹ % W,º +  ¸ ¸ ¹ % W-º ,  ¸ ¸ ¹ % Wº -  ¸ ¸ ¹ % W§ÿ² .4½ Y¸ 6SY+¸ ;¸ S¶ ?W² .E½ Y¸ 6SY,¸ ;¸ S¶ ?W² .G½ Y¸ 6SY-¸ ;¸ S¶ ?W² .I½ Y¸ 6SY¸ ;¸ S¶ ?W±       B           !  +  1  E  Y  m       ¦ ! Ä " â # $    H  1 Q    $ d  }    b }    ú     ò     ê    ! á       4  1 Q     ú     ò     ê    ! á        ÿ $  & & & &  ú c 
       ±     .» Y· L» KY· MM>¢ +,¶ N¸ 6¹ % W§ÿé+°           '  (  )  * & ) , ,    *     }    . b }    &               &        þ  & Kú       
       L     ¸ R@*¹ V ¸ Re­           0  1 
 2                   
 = >     ª     H*¸ Z*¹ ` l<*¹ ` p %*d¹ d À  ¶ h*¹ d À  ¶ ha km­*¹ d À  ¶ h­           6  7  8  9 : ;        H ¡     ; ¢ }         H ¡        ü :     £
 ¤ _     0     *¸ mX±                       
 ¥ _     0     *¸ rX±                       
 ¦ _     0     *¸ uW±                       
 § _     0     *¸ yW±                         ¨    © ª   *  ¸  « ¬ « ¸  « ¯ « ¸  « ² « ¸  « µ « ¿   
  À Â Ä 